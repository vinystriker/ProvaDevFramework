/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package viniciusjs;
/**
 *
 * @author vjsx
 */
public class MedicoDAO extends Conexao {
    
    public String CadastrarMedico (Medico medico)
    {
        try
        {
            String sentenca;
            sentenca = "INSERT INTO medico VALUES (NULL, '" + medico.getNome() 
                    + "','" + medico.getCpf() 
                    + "','" + medico.getCrm() +
                    "','" + medico.getEspecialidade() + "')";

            return this.atualizarBanco(sentenca);
        }
        catch(Exception e)
        {
            return e.getMessage();
        }
    }
        
}