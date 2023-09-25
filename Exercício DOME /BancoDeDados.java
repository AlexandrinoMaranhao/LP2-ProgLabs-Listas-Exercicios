package dome

import java.util.ArrayList;

public class BancoDeDados {
  private ArrayList<Item> itens;

  public BancoDeDados(){
    this.itens = new ArrayList<>();
  }
  
 public void adicionaItem (Item item){
    this.itens.add(item);
  }

 public void listaItens(){
    for(Item item : this.itens){
      item.imprime();
      System.out.println();
    }
 }
}
