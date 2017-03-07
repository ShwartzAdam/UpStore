package org.upstore.marketplace.resource;

import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.bson.Document;
import org.upstore.marketplace.model.Store;
import org.upstore.marketplace.service.StoreService;

import java.util.List;

@Path("/stores")
public class StoreResource {

	StoreService storeService = new StoreService();
  
	
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public List<Store> getAllStores(){
        return storeService.getAllStores();
    }
    
    @GET
    @Path("/{storeId}")
    @Produces(MediaType.APPLICATION_JSON)
    public Store getStore(@PathParam("storeId") int id)
    {
    	return storeService.getStore(id);
    }
    
    @POST
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public Store addStore(Store store){
    	return storeService.addStore(store);
    }
 
    /*
    @PUT
    @Path("/{storeId}")
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public Store updateStore(@PathParam("storeId") long id,Store store)
    {
    	store.setId(id);
    	return storeService.updateStore(store);
    }
   
    
    @DELETE
    @Path("/{storeId}")
    @Produces(MediaType.APPLICATION_JSON)
    public void deleteStore(@PathParam("storeId") long id)
    {
    	storeService.removeStore(id);
    }
    
    
     */
   
}
