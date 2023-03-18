package com.example.gmail.ui.home

class CorreoProvider {
    companion object{
        val correosList = listOf<Correo>(
            Correo(
                "UberEats",
                "Cristopher de ahorro para ti",
                "Lorem ipsum dolor sit amet",
                "https://cdn.freelogovectors.net/wp-content/uploads/2022/10/uber_eats_logo-freelogovectors.net_.png"
            ),
            Correo(
                "Audible.com",
                "Thanks, your order is complete",
                "Lorem ipsum dolor sit amet",
                "https://play-lh.googleusercontent.com/Eu29897hEHRlKDZoPHByn9pHnXwEqM0LDvDhDSrin9C2EUSxvz94V5zvVjO2SBBNXQ"
            ),
            Correo(
                "GitHub",
                "Has sido invitado a colaborar...",
                "Lorem ipsum dolor sit amet",
                "data:image/png;base64,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"
            ),
            Correo(
                "Banco Pichincha",
                "Cristopher, disfruta del feriado",
                "Lorem ipsum dolor sit amet",
                "data:image/png;base64,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"
            ),
            Correo(
                "banco",
                "Transferencia Banca Electrónica",
                "Lorem ipsum dolor sit amet",
                "data:image/png;base64,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"
            ),
            Correo(
                "LevelUp | ClickUp",
                "CRISTOPHER, tú elige si quieres programar...",
                "Lorem ipsum dolor sit amet",
                "data:image/jpeg;base64,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"
            ),
            Correo(
                "Google",
                "Alerta de Seguridad!",
                "Lorem ipsum dolor sit amet",
                "data:image/png;base64,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"
            ),
            Correo(
                "notificaciones-SAEw",
                "SAEw-Cita Tutoría",
                "Lorem ipsum dolor sit amet",
                "data:image/png;base64,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"
            ),
            Correo(
                "xperta",
                "Banco Pichincha Notificación",
                "Lorem ipsum dolor sit amet",
                "data:image/png;base64,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"
            ),
            Correo(
                "Google Play",
                "Actualizaciones en las Condiciones de Uso",
                "Lorem ipsum dolor sit amet",
                "data:image/png;base64,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"
            ),
            Correo(
                "Google Play",
                "Actualizaciones en las Condiciones de Uso",
                "Lorem ipsum dolor sit amet",
                "data:image/png;base64,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"
            )
        )
    }
}