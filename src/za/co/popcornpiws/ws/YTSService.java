package za.co.popcornpiws.ws;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.core.Response;
import org.json.JSONObject;

@Path("yts")
public class YTSService 
{
	@Path("cacheMovies/{totalPages}")
	@GET
	public Response cacheMovies(@PathParam("totalPages") int totalPages)
	{
		JSONObject toReturn = new JSONObject();
		toReturn.put("totalPages", totalPages);
		
		return Response.status(200).entity(toReturn.toString()).build();
	}
	
	@Path("getAllMovies")
	@GET
	public Response getAllMovies()
	{
		JSONObject toReturn = new JSONObject();
		toReturn.put("hello", "world");
		
		return Response.status(200).entity(toReturn.toString()).build();
	}
	
	@Path("download/{torrentURL}")
	public Response download(@PathParam("torrentURL") String torrentURL)
	{
		JSONObject toReturn = new JSONObject();
		toReturn.put("torrentURL", torrentURL);
		
		
		
		return Response.status(200).entity(toReturn.toString()).build();
	}
}
