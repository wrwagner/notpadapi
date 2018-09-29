package br.com.wagner.notpad.model

import org.springframework.data.annotation.Id
import org.springframework.data.mongodb.core.mapping.Document

@Document
data class Nota (
        @Id var id: String?,
        var titulo: String,
        var descricao: String
    )