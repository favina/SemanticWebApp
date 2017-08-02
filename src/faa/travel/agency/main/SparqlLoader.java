package faa.travel.agency.main;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.jena.ontology.OntModel;
import org.apache.jena.query.QueryExecution;
import org.apache.jena.query.QueryExecutionFactory;
import org.apache.jena.query.QueryParseException;
import org.apache.jena.query.ResultSet;
import org.apache.jena.shared.Lock;
import org.apache.jena.sparql.resultset.JSONOutput;

import faa.travel.agency.ontology.web.app.model.ModelProvider;

/**
 * Servlet implementation class SparqlLoader
 */
@WebServlet("/sparql")
public class SparqlLoader extends HttpServlet {
	
	private static final long serialVersionUID = 1L;
         
	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	//doPost query
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String query = request.getParameter("query");
		OntModel model = ModelProvider.MODEL;
		model.enterCriticalSection(Lock.WRITE);
		
		//get results In JSON
		try{
			QueryExecution c = QueryExecutionFactory.create(query, model);
			ResultSet result = c.execSelect();
			JSONOutput s = new JSONOutput();
			String jsonResult = s.asString(result);
			response.setContentType("application/json");
			PrintWriter writer = response.getWriter();
			writer.print(jsonResult);
			writer.close();
			
			
			
			
			
		}
		catch(QueryParseException exception){
		response.sendError(HttpServletResponse.SC_BAD_REQUEST, "Wrong Sparql syntax");
	}
	finally {
		model.leaveCriticalSection();
	}
       
	}

}
