/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package viniciusjs;

/**
 *
 * @author vjsx
 */
public class ConsultaDAO extends Conexao {
    
    public String CadastrarConsulta (Consulta consulta)
    {
        try
        {
            String sentenca;
            sentenca = "INSERT INTO consulta VALUES (NULL, '" + consulta.getConvenio() + "')";

            return this.atualizarBanco(sentenca);
        }
        catch(Exception e)
        {
            return e.getMessage();
        }
    }
    

}