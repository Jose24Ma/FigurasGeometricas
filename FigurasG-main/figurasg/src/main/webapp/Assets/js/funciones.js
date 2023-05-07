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
  let area = 0;
  
  switch(figura) {
    case "decagono":
      const perimetroDecagono = parseInt(document.getElementById("perimetroResultado").value);
      const apotemaDecagono = parseInt(document.getElementById("apotema").value);
      area = perimetroDecagono * apotemaDecagono / 2;
      document.getElementById("areaResultado").value = area;
      break;
    case "rombo":
      const diagonalMayor = parseInt(document.getElementById("diagonalmayor").value);
      const diagonalMenor = parseInt(document.getElementById("diagonalmenor").value);
      area = diagonalMayor * diagonalMenor / 2;
      document.getElementById("areaResultadoRombo").value = area;
      break;
    default:
      console.error("Figura no soportada");
  }
}

