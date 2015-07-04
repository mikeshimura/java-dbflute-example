package dbfexample.jaxrs;

import javax.inject.Singleton;
import javax.ws.rs.ClientErrorException;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import javax.ws.rs.ext.ExceptionMapper;
import javax.ws.rs.ext.Provider;

/**
 * Adds human readable text to client errors, in addition avoids printing stack
 * trace with exception.
 *
 * @author szymon
 */
@Provider
@Singleton
public class ClientErrorExceptionMapper implements
		ExceptionMapper<ClientErrorException> {

	@Override
	public Response toResponse(ClientErrorException e) {
		StringBuilder response = new StringBuilder("ERROR\n");
		response.append("message:" + e.getMessage());
		return Response.serverError().entity(response.toString())
				.type(MediaType.TEXT_PLAIN).build();
	}
}
