function obtenerPerimetroDecagono() {
    const ladoDecagono = parseInt(document.getElementById("lado").value);
    const perimetroDecagono = ladoDecagono * 5;
    document.getElementById("perimetroResultado").value = perimetroDecagono;
}
function obtenerAreaDecagono() {
    const perimetroDecagono = parseInt(document.getElementById("perimetroResultado").value);
    const apotemaDecagono = parseInt(document.getElementById("apotema").value);
    const areaDecagono = perimetroDecagono * apotemaDecagono / 2;
    document.getElementById("areaResultado").value = areaDecagono;
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

