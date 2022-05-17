package com.algaworks.algalog.domail.model.entity;

import lombok.Getter;
import lombok.Setter;

/**
 * created by:
 *
 * @author rafael barros for DevDusCorre <rafaelbarros.softwareengineer@gmail.com> on 17/05/2022
 */

@Getter
@Setter
public class Cliente {

   private Long id;
   private String nome;
   private String email;
   private String telefone;

}
