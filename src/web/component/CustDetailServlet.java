package web.component;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.cust.CustBiz;

@WebServlet({ "/CustDetailServlet", "/cdetail" })
public class CustDetailServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
    CustBiz biz;   
    public CustDetailServlet() {
        super();
        biz = new CustBiz();
    }

	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	}

}
