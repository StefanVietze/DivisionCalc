package at.vietze.divisionCalc;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import static java.lang.Integer.parseInt;

@Path("/api/calcDivision")
public class divisionCalcController {

    @GET
    @Produces(MediaType.TEXT_PLAIN)
    public String calculate() {
        return "<calculation result>";
    }

    // URL: /api/calcDivision/numerator/x/denominator/y/ -> div = x/y
    // /api/calcDivision?x=10&y=5
    @GET
    @Path("/numerator/{num}/denominator/{denom}/")
    @Produces(MediaType.TEXT_PLAIN)
    public String calculateDiv(
            @PathParam("num") String x,
            @PathParam("denom") String y
    ) {
        Calculator calc = new Calculator();
        return String.format("%d", calc.div(parseInt(x), parseInt(y)));
    }
}
