package br.com.wagner.notpad.controller

import br.com.wagner.notpad.model.Nota
import br.com.wagner.notpad.service.NotaService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping("/nota")
class NotaController {

    @Autowired
    lateinit var notaService: NotaService

    @GetMapping("/check")
    fun checkHelth(): String{
        return "OK"
    }
    @GetMapping
    fun getAll(): List<Nota>{
        return notaService.findAll()
    }

    @PostMapping
    fun save(@RequestBody nota: Nota): Nota{
        return notaService.salvar(nota)
    }

    @DeleteMapping("/{id}")
    fun delete(@PathVariable("id") id: String) {
        notaService.delete(id)
    }
    @GetMapping("{id}")
    fun findBy(@PathVariable("id") id: String): Nota {
        return notaService.findBy(id)
    }

    @GetMapping("/titulo/{titulo}")
    fun findByTitulo(@PathVariable("titulo") titulo: String) : List<Nota> {
        return notaService.findByTitulo(titulo)

    }
}