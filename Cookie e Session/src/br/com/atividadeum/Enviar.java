package br.com.atividadeum;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletResponse;

public class Enviar {

	public static void login(HttpServletResponse response, boolean withErrorMessage)
			throws IOException, ServletException {
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();

		out.println("<html>");
		out.println("<head>");
		out.println("<title>Login</title>");
		out.println("</head>");
		out.println("<body>");
		out.println("<h1>Login</h1>");
		out.println("<form method='post' action='LoginSession'>");
		out.println("Nome Usuário:");
		out.println("<input type='text' name='usuario'/> <br>");
		out.println("Senha: ");
		out.println("<input type='password' name='senha'/>");
		if (withErrorMessage) {
			out.println("<p>Informações de Login inválidas</p>");
		}
		out.println("<input type='submit' value='Enviar'/>");
		out.println("</form>");
		out.println("</body>");
		out.println("</html>");
	}

	public static void adminPage(HttpServletResponse response, String usuario) throws IOException, ServletException {
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		out.println("<html>");
		out.println("<head>");
		out.println("<title>Login</title>");
		out.println("</head>");
		out.println("<body>");
		out.println("<h1>Pagina de Administracao</h1>");
		out.println("Nome: " + usuario);
		out.println("</body>");
		out.println("</html>");

	}
}