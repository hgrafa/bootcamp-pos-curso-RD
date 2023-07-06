# Interfaces

A interface no Java estabelece um **contrato** a ser implementado.

```java
public interface AlunosDaRdFazem {
  void aoba();
}

public class AlunoDaRd implements AlunosDaRdFazem {

  void aoba() {
    System.out.println("aoba");
  }

}
```

```java
public interface Comunicar {
  void acenar();
  void falar();
}

public class Pikachu implements Comunicar {

  void acenar() {
    System.out.println("acenar com braco e cauda");
  }

  void falar() {
    System.out.println("pikachu");
  }

}
```
