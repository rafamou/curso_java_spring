/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


console.log("Generando tabla....");
generaTabla();
function generaTabla(){
    var table = document.getElementsByTagName("table");
    table= table[0];
    table.innerHTML ="<caption> lista de vainas</caption>";
    var nombrePrecio = "precio vaina";
    table.innerHTML += `
    <thead>
        <tr><th>tipo</th>
            <th>Nombre</th>
            <th>${nombrePrecio}</th> 
           <th>cantidad</th></tr>
    </thead>`;
    var lista =new Array();  // Asi se hace un array de 2 dimensions 
    lista =[["vaina " , "Peine", "15 euros","7"]];
    lista[1]=["vaina " , "quitapelos","50 euros" ,"10"];
    lista[2]=["vaina " , "coche","200 euros","100"];
    lista[3]=["vaina " , "pisos","1000 euros","0"];
    for (var i=0; i < lista.length; i++){
        var nodoTR = document.createElement("tr");
        table.appendChild(nodoTR);
        for(var columna of lista[i]){
            var nodoCol = document.createElement("td");
                nodoTR.appendChild(nodoCol);
            var textoCol = document.createTextNode(columna);
                nodoCol.appendChild(textoCol);
        } 
    }
}