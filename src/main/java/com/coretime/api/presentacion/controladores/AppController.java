package com.coretime.api.presentacion.controladores;

import java.util.List;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.coretime.api.dominio.entidades.Empresa;
import com.coretime.api.dominio.entidades.Usuario;
import com.coretime.api.dominio.entidades.Rol;
import com.coretime.api.dominio.entidades.Permiso;
import com.coretime.api.dominio.entidades.HorarioLaboral;
import com.coretime.api.dominio.entidades.Jornada;
import com.coretime.api.dominio.entidades.Comunicado;
import com.coretime.api.dominio.entidades.Grupo;

import com.coretime.api.dominio.repositorios.IEmpresaRepositorio;
import com.coretime.api.dominio.repositorios.IUsuarioRepositorio;
import com.coretime.api.dominio.repositorios.IRolRepositorio;
import com.coretime.api.dominio.repositorios.IPermisoRepositorio;
import com.coretime.api.dominio.repositorios.IHorarioLaboralRepositorio;
import com.coretime.api.dominio.repositorios.IJornadaRepositorio;
import com.coretime.api.dominio.repositorios.IComunicadoRepositorio;
import com.coretime.api.dominio.repositorios.IGrupoRepositorio;

import lombok.RequiredArgsConstructor;

@Controller
@RequestMapping("/app")
@RequiredArgsConstructor
public class AppController {
	// Inyectamos los repositorios
    private final IEmpresaRepositorio empresaRepositorio;
    private final IUsuarioRepositorio usuarioRepositorio;
    private final IRolRepositorio rolRepositorio;
    private final IPermisoRepositorio permisoRepositorio;
    private final IHorarioLaboralRepositorio horarioRepositorio;
    private final IJornadaRepositorio jornadaRepositorio;
    private final IComunicadoRepositorio comunicadoRepositorio;
    private final IGrupoRepositorio grupoRepositorio;

    @GetMapping("/empresas")
    public String listarEmpresas(Model model) {
    	List<Empresa> lista = empresaRepositorio.listarTodas();
        model.addAttribute("empresas", lista);
        return "empresas"; 
    }
    
    @GetMapping("/usuarios")
    public String listarUsuarios(Model model) {
        List<Usuario> lista = usuarioRepositorio.listarTodos();
        model.addAttribute("usuarios", lista);
        return "usuarios";
    }
    
    @GetMapping("/horarios")
    public String listarHorarios(Model model) {
        List<HorarioLaboral> lista = horarioRepositorio.listarTodos();
        model.addAttribute("horarios", lista);
        return "horarios";
    }
    
    // --- ESTE ES EL CORREGIDO (Borré el duplicado de abajo) ---
    @GetMapping("/jornadas")
    public String listarJornadas(Model model) {
        // CORRECCIÓN: Usamos .listarTodas() (femenino) como está en tu interfaz
        List<Jornada> lista = jornadaRepositorio.listarTodas();
        
        model.addAttribute("jornadas", lista);
        return "jornadas"; 
    }
    
    @GetMapping("/roles")
    public String listarRoles(Model model) {
        List<Rol> lista = rolRepositorio.listarTodos();
        model.addAttribute("roles", lista);
        return "roles";
    }
    
    @GetMapping("/permisos")
    public String listarPermisos(Model model) {
        List<Permiso> lista = permisoRepositorio.listarTodos();
        model.addAttribute("permisos", lista);
        return "permisos";
    }
    
    // --- COMUNICACIÓN ---
    
    @GetMapping("/comunicados")
    public String listarComunicados(Model model) {
        List<Comunicado> lista = comunicadoRepositorio.listarTodos();
        model.addAttribute("comunicados", lista);
        return "comunicados";
    }
    
    // --- GRUPOS ---
    @GetMapping("/grupos")
    public String listarGrupos(Model model) {
        // 2. Buscamos la lista usando el método de tu interfaz
        List<Grupo> lista = grupoRepositorio.listarTodos();
        
        // 3. Enviamos a la vista
        model.addAttribute("grupos", lista);
        
        return "grupos"; // Busca grupos.html
    }
	
}
