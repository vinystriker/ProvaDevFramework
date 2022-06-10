/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package viniciusjs;

/**
 *
 * @author vjsx
 */
public class PacienteDAO extends Conexao {
    
    public String CadastrarPaciente (Paciente paciente)
    {
        try
        {
            String sentenca;
            sentenca = "INSERT INTO paciente VALUES (NULL, '" + paciente.getNome() 
           +  "','" + paciente.getCpf() + "','" + paciente.getIdade() + "')";

            return this.atualizarBanco(sentenca);
        }
        catch(Exception e)
        {
            return e.getMessage();
        }
    }
}