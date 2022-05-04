const listaEstudiantes = [
    {
        nombre: "Leonardo",
        nota: 5,
        promedioTotal: 3
    },
    {
        nombre: "Maria",
        nota: 4,
        promedioTotal: 5
    },
    {
        nombre: "David",
        nota: 2,
        promedioTotal: 4
    },
]

const listaPersonas = [
    {
        nombre: "Leonardo",
        edad: 50,
        esColombiano: false
    },
    {
        nombre: "Maria",
        edad: 25,
        esColombiano: true
    },
    {
        nombre: "David",
        edad: 24,
        esColombiano: true
    },
    {
        nombre: "Carla",
        edad: 35,
        esColombiano: false
    },
    {
        nombre: "Diana",
        edad: 45,
        esColombiano: true
    },
]

function prueba1() {
    alert("Esto es la prueba 1")
}

function pruebasConsola() {
    console.log("Esto es un mensaje informativo")
    console.error("Error crítico")
    console.warn("Advertencia")
}

function variables(valorInicial) {
    const varInmutable = valorInicial
    let varMutable = valorInicial
    varMutable = 1
    
    console.info("Inmutable ".concat(varInmutable).concat(". Mutable ").concat(varMutable))
}

function listas1() {
    const lista1 = [2, 3, 5, 7, 8, 10, 15, 24, 56]
    const listaMayores10 = lista1.filter(n => n > 10)
    console.info(listaMayores10)
}

function listas2() {
    const listaEstudiantesSobresalientes = listaEstudiantes.filter(e => e.nota >= 4)
    console.info(listaEstudiantesSobresalientes)
}

function listas3() {
    const listaNombresEstudiantes = listaEstudiantes.map(e => {
        return e.nombre.toUpperCase()
    })
    console.log(listaNombresEstudiantes)
}

function listas4() {
    const lista2Estudiantes = listaEstudiantes
    lista2Estudiantes.forEach(n => n.nombre.concat("A"))
    console.log(lista2Estudiantes)
}

function listas5() {
    const listaNombresSobresalientes = listaEstudiantes.filter(e => e.nota < 3).map(r => r.nombre)
    console.log(listaNombresSobresalientes)
}

function listas6() {
    const sumasDePromedios = listaEstudiantes.map(e => e.promedioTotal).reduce((acum, current) => acum + current, 0)
    const sumasDePromedios2 = listaEstudiantes.reduce((acum, current) => acum + current.promedioTotal, 0)
    const promedioDelPromedio = sumasDePromedios / listaEstudiantes.length
    console.log(sumasDePromedios2)
    console.log(sumasDePromedios)
    console.log(promedioDelPromedio)
}

function listas7() {
    const personasEstudiantes = listaPersonas.filter(p => {
        return listaEstudiantes.some(e => e.nombre === p.nombre)
    }).map(pe => pe.edad)
    console.log(personasEstudiantes)
}

async function callApi() {
    const url = "https://digimon-api.herokuapp.com/api/digimon"
    const config = {
        method: "GET",
        headers: {
          "Content-Type": "application/json",
        },
      }


    const response = await fetch(url, config)
    const content = await response.json()
    const digimonNames = content.map(d => d.name)
    console.log(digimonNames)
}