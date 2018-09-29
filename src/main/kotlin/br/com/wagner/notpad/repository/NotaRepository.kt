package br.com.wagner.notpad.repository

import br.com.wagner.notpad.model.Nota
import org.springframework.data.mongodb.repository.MongoRepository
import org.springframework.stereotype.Repository

@Repository
interface NotaRepository : MongoRepository<Nota, String>{
    fun findByTituloContainingIgnoreCase(titulo: String): List<Nota>

}