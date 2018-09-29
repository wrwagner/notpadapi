package br.com.wagner.notpad.service

import br.com.wagner.notpad.model.Nota
import br.com.wagner.notpad.repository.NotaRepository
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service

@Service
class NotaService {

    @Autowired
    lateinit var notaRepository: NotaRepository

    fun salvar(nota: Nota): Nota {
        return notaRepository.save(nota)
    }

    fun findAll(): List<Nota> {
        return notaRepository.findAll()
    }

    fun delete(id: String){
        notaRepository.deleteById(id)
    }

    fun findBy(id: String): Nota {
        return notaRepository.findById(id).get()
    }

    fun findByTitulo(titulo: String): List<Nota> {
        return notaRepository.findByTituloContainingIgnoreCase(titulo)
    }

}