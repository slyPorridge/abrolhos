package io.github.slyporridge.abrolhos.application.controller

import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/user")
class UserController {
    /*
    @Autowired
    lateinit var authenticationManager: AuthenticationManager
    @Autowired
    lateinit var repository: UserRepository
    @Autowired
    lateinit var tokenService: TokenService

    @PostMapping("/login")
    fun login(@RequestBody @Validated authenticationRequest: AuthenticationRequest): ResponseEntity<AuthenticationResponse> {
        val usernamePassword = UsernamePasswordAuthenticationToken(authenticationRequest.login(), authenticationRequest.password())
        val auth = authenticationManager.authenticate(usernamePassword)

        val token: Unit = tokenService.generateToken(auth.principal as User)

        return ResponseEntity.ok<Any>(AuthenticationResponse(token))
    }

    @PostMapping("/register")
    fun register(@RequestBody @Validated registerRequest: RegisterRequest): ResponseEntity<*> {
        if (repository.findByLogin(registerRequest.login()) != null) return ResponseEntity.badRequest().build<Any>()

        val encryptedPassword = BCryptPasswordEncoder().encode(registerRequest.password())
        val newUser: User = User(registerRequest.login(), encryptedPassword, registerRequest.role())

        repository.save(newUser)

        return ResponseEntity.ok().build<Any>()
    }
     */
}
