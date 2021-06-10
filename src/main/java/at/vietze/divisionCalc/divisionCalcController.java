package at.vietze.divisionCalc;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/api/calcDivision")
public class divisionCalcController {

    @GET
    @Produces(MediaType.TEXT_PLAIN)
    public String calculate() {
        return "<calculation result>";
    }
}
