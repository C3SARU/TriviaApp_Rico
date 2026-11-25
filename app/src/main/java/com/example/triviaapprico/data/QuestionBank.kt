package com.example.triviaapprico.data

import com.example.triviaapprico.model.Question

object QuestionBank {

    const val CATEGORY_ALL = "Todas"
    const val CATEGORY_SCIENCE = "Ciencia y Tech"
    const val CATEGORY_HISTORY = "Historia y Geo"
    const val CATEGORY_GENERAL = "Cultura General"

    private val allQuestions = listOf(
        // Ciencia y Tecnología
        Question(
            id = 1,
            category = CATEGORY_SCIENCE,
            text = "¿Cuál es el planeta más grande del sistema solar?",
            options = listOf("Saturno", "Júpiter", "Neptuno", "Urano"),
            correctAnswerIndex = 1
        ),
        Question(
            id = 2,
            category = CATEGORY_SCIENCE,
            text = "¿Qué elemento químico tiene el símbolo 'Au'?",
            options = listOf("Plata", "Aluminio", "Oro", "Argón"),
            correctAnswerIndex = 2
        ),
        Question(
            id = 3,
            category = CATEGORY_SCIENCE,
            text = "¿Qué lenguaje de programación fue adoptado por Google como oficial para Android en 2019?",
            options = listOf("Swift", "Kotlin", "Ruby", "Dart"),
            correctAnswerIndex = 1
        ),
        Question(
            id = 4,
            category = CATEGORY_SCIENCE,
            text = "¿Cuál es la velocidad aproximada de la luz en el vacío?",
            options = listOf("300,000 km/s", "150,000 km/s", "30,000 km/s", "3,000 km/s"),
            correctAnswerIndex = 0
        ),
        Question(
            id = 5,
            category = CATEGORY_SCIENCE,
            text = "¿Qué órgano del cuerpo humano consume aproximadamente el 20% de la energía total?",
            options = listOf("El corazón", "El hígado", "El cerebro", "Los pulmones"),
            correctAnswerIndex = 2
        ),
        Question(
            id = 6,
            category = CATEGORY_SCIENCE,
            text = "¿Qué significan las siglas 'CPU' en informática?",
            options = listOf(
                "Central Process Utility",
                "Central Processing Unit",
                "Computer Personal Unit",
                "Control Panel User"
            ),
            correctAnswerIndex = 1
        ),

        // Historia y Geografía
        Question(
            id = 7,
            category = CATEGORY_HISTORY,
            text = "¿En qué año llegó el ser humano a la Luna por primera vez?",
            options = listOf("1965", "1969", "1972", "1959"),
            correctAnswerIndex = 1
        ),
        Question(
            id = 8,
            category = CATEGORY_HISTORY,
            text = "¿Cuál es el río más largo del mundo?",
            options = listOf("Río Nilo", "Río Yangtsé", "Río Amazonas", "Río Misisipi"),
            correctAnswerIndex = 2
        ),
        Question(
            id = 9,
            category = CATEGORY_HISTORY,
            text = "¿Cuál es la capital de Japón?",
            options = listOf("Kioto", "Osaka", "Seúl", "Tokio"),
            correctAnswerIndex = 3
        ),
        Question(
            id = 10,
            category = CATEGORY_HISTORY,
            text = "¿Qué civilización antigua construyó Machu Picchu?",
            options = listOf("Los Mayas", "Los Aztecas", "Los Incas", "Los Olmecas"),
            correctAnswerIndex = 2
        ),
        Question(
            id = 11,
            category = CATEGORY_HISTORY,
            text = "¿Cuál es el océano más grande de la Tierra?",
            options = listOf("Océano Atlántico", "Océano Índico", "Océano Ártico", "Océano Pacífico"),
            correctAnswerIndex = 3
        ),
        Question(
            id = 12,
            category = CATEGORY_HISTORY,
            text = "¿En qué continente se encuentra el desierto del Sahara?",
            options = listOf("Asia", "África", "Oceanía", "América"),
            correctAnswerIndex = 1
        ),

        // Cultura General
        Question(
            id = 13,
            category = CATEGORY_GENERAL,
            text = "¿Quién pintó la famosa obra 'La noche estrellada'?",
            options = listOf("Pablo Picasso", "Claude Monet", "Vincent van Gogh", "Salvador Dalí"),
            correctAnswerIndex = 2
        ),
        Question(
            id = 14,
            category = CATEGORY_GENERAL,
            text = "¿Cuántos colores tiene el arcoíris tradicionalmente?",
            options = listOf("5", "6", "7", "8"),
            correctAnswerIndex = 2
        ),
        Question(
            id = 15,
            category = CATEGORY_GENERAL,
            text = "¿Quién escribió 'Don Quijote de la Mancha'?",
            options = listOf(
                "Gabriel García Márquez",
                "Miguel de Cervantes",
                "Lope de Vega",
                "Federico García Lorca"
            ),
            correctAnswerIndex = 1
        ),
        Question(
            id = 16,
            category = CATEGORY_GENERAL,
            text = "¿Cuál es el instrumento musical nacional de Japón?",
            options = listOf("Sitar", "Koto", "Laúd", "Arpa"),
            correctAnswerIndex = 1
        ),
        Question(
            id = 17,
            category = CATEGORY_GENERAL,
            text = "¿Cuántos jugadores hay en el campo por equipo en un partido de fútbol estándar?",
            options = listOf("9", "10", "11", "12"),
            correctAnswerIndex = 2
        ),
        Question(
            id = 18,
            category = CATEGORY_GENERAL,
            text = "¿Cuál es el idioma más hablado del mundo por número de hablantes nativos?",
            options = listOf("Inglés", "Español", "Chino mandarín", "Hindi"),
            correctAnswerIndex = 2
        )
    )

    fun getQuestionsForCategory(category: String): List<Question> {
        val filtered = if (category == CATEGORY_ALL) {
            allQuestions
        } else {
            allQuestions.filter { it.category == category }
        }
        return filtered.shuffled().take(10)
    }
}