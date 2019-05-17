/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


console.log("Generando tabla....");
generaTabla();

 function insertarFilla() {
    var table =document.getElementsByTagName("table");
    table = table[0];

    var nombre =document.getElementById("nombre").value ;
    var tipo =document.getElementById("tipo").value;
    var cantidad =document.getElementById("cantidad").value;
    var precio =document.getElementById("precio").value;

    table.innerHTML += `
        <tr><td>${tipo}</td>
            <td>${nombre}</td>
            <td>${precio}</td> 
           <td>${cantidad}</td>
       </tr> `;
}
    document.body.innerHTML += `  
     <form action="#"
                method="post" enctype="text/plain">
           <br/>  <label for="nombre">nombre:</label>
                <input type="text" name="nombre" id="nombre"  /><br/>                 
            <label for="nombre">precio:</label>
                <input type="text" name="precio" id="precio"  /><br/> 
            <label for="nombre">cantidad:</label>
                <input type="text" name="cantidad" id="cantidad"  /><br/> 
            <label for="nombre">tipo:</label>
                <input type="text" name="tipo" id="tipo"  /><br/> 
            <br/>
            <input type="button"  value="Enviar formulario" onclick="insertarFilla()"/>
            <input type="reset" value="Borrar formulario"/>
        </form> `;



function generaTabla() {
    var table = document.getElementsByTagName("table");
    table = table[0];
    table.innerHTML = "<caption> lista de vainas</caption>";
    var nombrePrecio = "Precio ";
    table.innerHTML += `
    <thead>
        <tr><th>Tipo</th>
            <th>Nombre</th>
            <th>${nombrePrecio}</th> 
           <th>Cantidad</th></tr>
    </thead>`;
    var lista = new Array();  // Asi se hace un array de 2 dimensions 
    lista = [["vaina ", "Peine", "15 euros", "7"]];
    lista[1] = ["vaina ", "quitapelos", "50 euros", "10"];
    lista[2] = ["vaina ", "coche", "200 euros", "100"];
    lista[3] = ["vaina ", "pisos", "1000 euros", "0"];
    for (var i = 0; i < lista.length; i++) {
        var nodoTR = document.createElement("tr");
        table.appendChild(nodoTR);
        for (var columna of lista[i]) {
            var nodoCol = document.createElement("td");
            nodoTR.appendChild(nodoCol);
            var textoCol = document.createTextNode(columna);
            nodoCol.appendChild(textoCol);
        }
    }

}