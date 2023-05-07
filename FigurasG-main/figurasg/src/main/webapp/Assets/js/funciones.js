function calcularPerimetroFigura() {
  const figura = document.getElementById("figura").value;
  const medida = parseInt(document.getElementById("medida").value);
  let perimetro = 0;
  
  switch(figura) {
    case "decagono":
      perimetro = medida * 10;
      break;
    case "rombo":
      perimetro = medida * 4;
      break;
    case "pentagono":
      perimetro = medida * 5;
      break;
    default:
      console.error("Figura no soportada");
  }
  
  document.getElementById("perimetroResultado").value = perimetro;
}

function calcularAreaFigura() {
 const figura = document.getElementById("figura").value;

    switch (figura) {
        case "decagono":
            calcularAreaDecagono();
            break;
        case "rombo":
            calcularAreaRombo();
            break;
        default:
            console.error("Figura no soportada");
    }
    function calcularAreaDecagono() {
        const perimetroDecagono = parseInt(document.getElementById("perimetroResultado").value);
        const apotemaDecagono = parseInt(document.getElementById("apotema").value);
        const areaDecagono = perimetroDecagono * apotemaDecagono / 2;
        document.getElementById("areaResultado").value = areaDecagono;
    }

    function calcularAreaRombo() {
        const diagonalMayor = parseInt(document.getElementById("diagonalmayor").value);
        const diagonalMenor = parseInt(document.getElementById("diagonalmenor").value);
        const areaRombo = diagonalMayor * diagonalMenor / 2;
        document.getElementById("areaResultadoRombo").value = areaRombo;
    }
}

