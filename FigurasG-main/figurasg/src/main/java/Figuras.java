// import java.io.IOException;

// import javax.servlet.ServletException;
// import javax.servlet.http.HttpServlet;
// import javax.servlet.http.HttpServletRequest;
// import javax.servlet.http.HttpServletResponse;

// import formasGeometricas.decagono;


// public class Figuras extends HttpServlet
// {

//     @Override
//     protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
//         super.doGet(req, resp);
//         String accion = req.getParameter("Accion");
//         System.out.println(accion);

//         switch(accion){
//             case "decagono":
//             req.getRequestDispatcher("decagono.jsp").forward(req, resp);
//             break;
//         }
//     }

//     @Override
//     protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
//         String accion=req.getParameter("accion");
//         System.out.println(accion);
//         switch(accion)
//         {
//             case"enviar":
//             double l=Double.parseDouble(req.getParameter("lado"));
//             decagono decagono = new decagono();
//             req.setAttribute("area", decagono.calcularArea());
//             req.getRequestDispatcher("resultado.jsp").forward(req, resp);
//             break;
//         }
//     }

// }
