function obtenerArea() {
    const p = parseInt(document.getElementById("perimetroResultado").value);
    const h = parseInt(document.getElementById("apotema").value);
    const area = p * h / 2;
    document.getElementById("areaResultado").value = area;
}
function obtenerPerimetro() {
    const lado = parseInt(document.getElementById("lado").value);
    const perimetro = lado * 5;
    document.getElementById("perimetroResultado").value = perimetro;
}
function obtenerPerimetroRombo() {
    const ladoRombo = parseInt(document.getElementById("lado").value);
    const perimetroRombo = ladoRombo * 4;
    document.getElementById("perimetroResultado").value = perimetroRombo;
}
function obtenerAreaRombo() {
    const diagonalMayor = parseInt(document.getElementById("diagonalmayor").value);
    const diagonalMenor = parseInt(document.getElementById("diagonalmenor").value);
    const areaRombo = diagonalMayor * diagonalMenor / 2;
    document.getElementById("areaResultadoRombo").value = areaRombo;
}
function obtenerPerimetroPentagono() {
    const ladoPentagono = parseInt(document.getElementById("lado").value);
    const perimetroPentagono = ladoPentagono * 5;
    document.getElementById("perimetroResultado").value = perimetroPentagono;
}

