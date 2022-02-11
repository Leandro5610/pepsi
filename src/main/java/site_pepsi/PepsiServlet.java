package site_pepsi;

import java.io.IOException;

import java.util.Calendar;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.tomcat.jni.Time;
@WebServlet("/cadastrar")
public class PepsiServlet extends HttpServlet{
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String nome = req.getParameter("nome");
		String sbNome = req.getParameter("sbnome");
		String email = req.getParameter("email");
		String genero = req.getParameter("sexo");
		String dia;
		Calendar conv = Calendar.getInstance();
		int idade =Integer.parseInt(req.getParameter("idade"));
		
		Pessoa pessoa = new Pessoa();
		pessoa.setNome(nome);
		pessoa.setSbNome(sbNome);
		pessoa.setEmail(email);
		pessoa.setGenero(genero);
		
		switch (genero) {
		case "M":
			genero ="Sr.";
			break;
		case "F":
			genero ="Sra.";
			break;
		default:
			break;
		}
		if(conv.get(Calendar.HOUR_OF_DAY)<12) {
			dia ="Bom dia";
		}else if(conv.get(Calendar.HOUR_OF_DAY)<18){
			dia ="Boa Tarde";
		}else {
			dia= "Boa Noite";
		}
		req.setAttribute("genero", genero);
		req.setAttribute("dia", dia);
		req.setAttribute("pessoa", pessoa);
		req.getRequestDispatcher("WEB-INF/concluido.jsp").forward(req, resp);
		
	}
}
