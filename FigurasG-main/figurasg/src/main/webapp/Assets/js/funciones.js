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
  let areaR,areaD = 0;
  
  switch(figura) {
    case "decagono":
      const perimetroDecagono = parseInt(document.getElementById("perimetroResultado").value);
      const apotemaDecagono = parseInt(document.getElementById("apotema").value);
      areaD = perimetroDecagono * apotemaDecagono / 2;
      document.getElementById("areaResultado").value = areaD;
      break;
    case "rombo":
      const diagonalMayor = parseInt(document.getElementById("diagonalmayor").value);
      const diagonalMenor = parseInt(document.getElementById("diagonalmenor").value);
      areaR = diagonalMayor * diagonalMenor / 2;
      document.getElementById("areaResultadoRombo").value = areaR;
      break;
    default:
      console.error("Figura no soportada");
  }
}

