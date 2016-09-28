<%-- 
    Document   : inventory
    Created on : 9/09/2016, 10:16:39 PM
    Author     : santhyago
--%>

<%@page import="java.util.ArrayList"%>
<%@page import="beans.Implements"%>
<%@page import="DAO.DaoInventory"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
                <link rel="icon" type="image/png" href="imgs/logop.png"/>
       
        <title>SportSoft</title>
         <!------------------------------------MATERIALIZECSS--------------------------------------->
        <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/materialize/0.97.7/css/materialize.min.css">
        <script src="https://ajax.googleapis.com/ajax/libs/jquery/1.12.2/jquery.min.js"></script>
        <script src="https://cdnjs.cloudflare.com/ajax/libs/materialize/0.97.7/js/materialize.min.js"></script>
        <link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet">
        <script src="js/inicioMaterializecss.js" type="text/javascript"></script>
        <!------------------------------------AJAX---------------------------------------->
        <script src="js/ajax.js" type="text/javascript"></script>
        <!------------------------------------JQUERY------------------------------------->
        <script src="js/jquery.js" type="text/javascript"></script>
        <script src="js/validaciones.js" type="text/javascript"></script>
        <!------------------------------------CSS---------------------------------------->
        <link href="css/estilos.css" rel="stylesheet" type="text/css"/>
        <!------------------------------------SWEETALERT------------------------------------->
        <link href="css/sweetalert.css" rel="stylesheet" type="text/css"/>
        <script src="js/sweetalert.min.js" type="text/javascript"></script>
        <script src="js/datatable.js" type="text/javascript"></script>
        <!------------------------------------DATATABLE------------------------------------------------------------------->
         <script type="text/javascript" src="http://cdn.datatables.net/1.10.12/js/jquery.dataTables.min.js"></script>
         <link href="https://cdn.datatables.net/1.10.12/css/jquery.dataTables.min.css" rel="stylesheet" type="text/css"/>
         <link href="https://cdn.datatables.net/buttons/1.2.2/css/buttons.dataTables.min.css" rel="stylesheet" type="text/css"/>
         <script src="code.jquery.com/jquery-1.12.3.js" type="text/javascript"></script>
          <script src="https://cdn.datatables.net/1.10.12/js/jquery.dataTables.min.js" type="text/javascript"></script>
          <script src="https://cdn.datatables.net/buttons/1.2.2/js/dataTables.buttons.min.js" type="text/javascript"></script>
          <script src="//cdnjs.cloudflare.com/ajax/libs/jszip/2.5.0/jszip.min.js" type="text/javascript"></script>
          <script src="//cdn.rawgit.com/bpampuch/pdfmake/0.1.18/build/pdfmake.min.js" type="text/javascript"></script>
          <script src="//cdn.rawgit.com/bpampuch/pdfmake/0.1.18/build/vfs_fonts.js" type="text/javascript"></script>
          <script src="//cdn.datatables.net/buttons/1.2.2/js/buttons.html5.min.js" type="text/javascript"></script>
          <link href="https://cdn.datatables.net/1.10.12/css/jquery.dataTables.min.css" rel="stylesheet" type="text/css"/>
          <link href="https://cdn.datatables.net/buttons/1.2.2/css/buttons.dataTables.min.css" rel="stylesheet" type="text/css"/>
          <link href="//cdnjs.cloudflare.com/ajax/libs/font-awesome/4.4.0/css/font-awesome.min.css" rel="stylesheet" type="text/css"/>

    
         <!---------------------------------------------------------PACE------------------------------------------->
         <script src="js/pace.min.js" type="text/javascript"></script>
         <link href="templates/pace-theme-corner-indicator.tmpl.css" rel="stylesheet" type="text/css"/>
   <!------------------------------------------------------------------------------------------------------------------------------->
  
    </head>
    
    <body>
         <nav>
           <div class="nav-wrapper green accent-4">
    <a href="paginaPrincipal.jsp" class="brand-logo"><img src="imgs/logop.png"></a>
      <a href="#" data-activates="mobile-demo" class="button-collapse"><i class="material-icons">menu</i></a>
      <ul class="right hide-on-med-and-down">
          <li><a href="#" id="agregarImplementos" onclick="addImplements()">Agregar Implementos</a></li>
        
      </ul>
      <ul class="side-nav" id="mobile-demo">
           <li><a href="#" id="agregarImplementos">Agregar Implementos</a></li>

        
      </ul>
    </div>
      </nav>
        
        
         <div class="container">
                       <h3 class="center-align">Inventario</h3>
            <div class="row card-panel lighten-1" id="formInventario">
                <h2>Implementos Deportivos</h2>
         <form >
             <div class="input-field">
                 <input id="codigoI" name="codigo" type="text" required="Debe llenarlo!">
          <label for="codigo">Codigo</label>
        </div>
         <div class="input-field">
              <input id="nombreI" name="nombre" type="text">
          <label for="nombre">Nombre</label>
        </div>
          <div class="input-field">
              <input id="marcaI" name="marca" type="text">
          <label for="marca">Marca</label>
        </div>
         <div class="input-field">
             <input id="descripcionI" name="descripcion" type="text">
          <label for="descripcion">Descripción</label>
        </div>
             <div class="input-field">
             <input id="cantidadI" name="cantidad" type="text" onkeypress="return isNumberKey(event)">
          <label for="cantidad">Cantidad</label>
        </div>
        <div class="input-field">
    <select id="estadoI" name="estado">
      <option value="Bueno">Bueno</option>
      <option value="Medio">Medio</option>
      <option value="Malo">Malo</option>
    </select>
    
        
  </div>
         
        <div class="center-align">
      

      <button class="btn waves-effect green accent-4  btnGuardarImplementos" type="button" id="btnGuardarImplementos">Guardar</button>
      <button class="btn waves-effect green accent-4 btnModificarImplemento" type="button" id="btnModificarImplemento">Modificar </button>
             <button class="btn waves-effect waves-light green accent-4" type="button" id="cancelar">Cancelar </button>
   
        </div>
    </form>
  </div>
             <br><br>
             <div class="row">
             <div id="divInventario" class="card-panel lighten-1 col s12">
                 <table id="tblDatosImplementos" class="bordered striped responsive-table" >
                     <thead>
                     <th>Codigo</th>
                     <th>Nombre</th>
                     <th>Marca</th>
                     <th>Descripción</th>
                     <th>Cantidad</th>
                     <th>Estado</th>
                     <th>Modificar</th>
                     <th>Eliminar</th>
                     </thead>
                     <tbody>
                         <%DaoInventory daoin = new DaoInventory();
                         Implements in = new Implements();
                         ArrayList<Implements> list = daoin.listImplements();
                         if(list != null){
                         for(int i = 0; i < list.size(); i++){
                         in = list.get(i);
                   String json = "[{id:'"+in.getId()+"',cod:'"+in.getCode()+"',nom:'"+in.getName()+"',mar:'"+in.getBrand()+"',cant:'"+in.getQuantity()+"',desc:'"+in.getDescription()+"',est:'"+in.getState()+"'}]";

                        %>
                        <tr>
                            <td><%=in.getCode()%></td>
                            <td><%=in.getName()%></td>
                            <td><%=in.getBrand()%></td>
                            <td><%=in.getDescription()%></td>
                            <td><%=in.getQuantity()%></td>
                            <td><%=in.getState()%></td>
                            <td ><button class="modificarImplementos" id="<%=json%>" onclick="updateImplements(this)"  value="<%=in.getId()%>" ><i class="material-icons small " id="modificarImplementos" value="" >mode_edit</i></button></td>
                        <td><button class="btnEliminarImplementos"  value="<%=in.getId()%>"><i class="material-icons small">delete</i></button></td>
                       

                        </tr>
                        <% }
                         }else{%>
                     <h1>no exiaten datos</h1>
                             <% }
                         %>
                     </tbody>
                 </table>
             </div>
             </div>         
             
         </div>
                     
                      <footer class="page-footer green accent-4" >
          <div class="container">
            <div class="row">
              <div class="col l6 s12">
                <h5 class="white-text">Datos de la empresa</h5>
                <p class="grey-text text-lighten-4">Nombre: Grupo SportSoft.</p>
                <p class="grey-text text-lighten-4">Direccion: Cr 23b Nr 38b - 274</p>
                <p class="grey-text text-lighten-4">Teléfono: 5283318</p>
                <p class="grey-text text-lighten-4">Correo: gruposportsoft@gmail.com</p>

              </div>
              <div class="col l4 offset-l2 s12">
                <h5 class="white-text">Acerca de</h5>
                <ul>
                  <li><a class="grey-text text-lighten-3" href="#!">Manual de usuario</a></li>
                  <li><a class="grey-text text-lighten-3" href="#!">Manual técnico</a></li>
                  <li><a class="grey-text text-lighten-3" href="condiciones.jsp">Términos de uso</a></li>
                  <!--<li><a class="grey-text text-lighten-3" href="#!">Link 3</a></li>
                  <li><a class="grey-text text-lighten-3" href="#!">Link 4</a></li>-->
                </ul>
              </div>
            </div>
          </div>
            
<div class="footer">
    <h4 class="white-text">redes sociales</h4>
    <div class="social"><a >&#62220;</a></div>
    <div class="social"><a href="https://twitter.com/?request_context=signup">&#62217;</a></div>
    <div class="social"><a href="https://plus.google.com/u/0/">&#62223;</a></div>
  
</div>
          <div class="footer-copyright center-align">
            <div class="container">
            © 2014 Copyright SportSoft (V1)
           <!-- <a class="grey-text text-lighten-4 right" href="#!">More Links</a>-->
            </div>
          </div>
        </footer>
            
            
            
    </body>
</html>
