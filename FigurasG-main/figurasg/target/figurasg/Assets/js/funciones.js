function obtenerArea() {
    var p = parseInt(document.getElementById("perimetroResultado").value);
    var h = parseInt(document.getElementById("apotema").value);
    var area = p * h / 2;
    var areaResultado = document.getElementById("areaResultado").value = area;
  }

function obtenerPerimetro() {
    var l = parseInt(document.getElementById("lado").value);
    var perimetro = l * 5;
    var perimetroResultado = document.getElementById("perimetroResultado").value = perimetro;
  }

function obtenerPerimetroRombo() {
  var l = parseInt(document.getElementById("lado").value);
  var perimetro = l * 4;
  var perimetroResultado = document.getElementById("perimetroResultado").value = perimetro;

}

function obtenerAreaRombo() {
    var dy = parseInt(document.getElementById("diagonalmayor").value);
    var dm = parseInt(document.getElementById("diagnonalmenor").value);
    var area = dy * dm / 2;
    var areaResultadoRombo = (document.getElementById("areaResultadoRombo").value = area);
}

function obtenerPerimetroPentagono() {
  var l = parseInt(document.getElementById("lado").value);
  var perimetro = l * 6;
  var perimetroResultado = document.getElementById("perimetroResultado").value = perimetro;
}


