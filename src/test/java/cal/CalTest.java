/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package cal;

import static org.junit.Assert.*;

import org.junit.Test;

/**
 *
 * @author Vitor Lameirão, Maycon Felipe Mota (2021.1906.069-7)
 */
public class CalTest {

  public CalTest() {}

  @Test
  public void testJan1RetornaNaoNuloParaAnoInvalido() {
    // Given
    Cal cal = new Cal();
    int year = -1;
    // When
    int result = cal.jan1(year);
    // Then
    assertNotNull(result);
  }

  @Test
  public void testParaVerificarSeAnoBisextoEhAnoBisexto() {
    // Given
    Cal cal = new Cal();
    int year = 2024;
    boolean result = cal.isLeap(year);

    // Then
    assertTrue(result);
  }

  @Test
  public void testIsLeapYearRetornaFalsoParaAnoNaoBissexto() {
    // Given
    Cal cal = new Cal();
    int year = 2023;
    boolean result = cal.isLeap(year);
    assertFalse(result);
  }

  @Test
  public void testFirstOfMonthRetornaValorCorretoParaJaneiro() {
    // Given
    Cal cal = new Cal();
    int month = 1;
    int year = 2022;

    // When
    int result = cal.firstOfMonth(month, year);

    // Then
    assertEquals(6, result);
  }

  @Test
  public void testAnoAtualNaoEhIgualAoAnoAnterior() {
    // Dado que estou usando a classe Cal
    Cal cal = new Cal();

    // Quando eu obtenho o valor do primeiro dia do ano atual e anterior
    int anoAtual = 2023;
    int dataAtual = cal.jan1(anoAtual);
    int anoAnterior = 2022;
    int dataAnterior = cal.jan1(anoAnterior);

    // Então os valores obtidos devem ser diferentes
    assertNotSame(dataAnterior, dataAtual);
  }

  @Test
  public void testAnoAtualIgualAoAnoAnterior() {
    // Dado que estou usando a classe Cal
    Cal cal = new Cal();

    // Quando eu obtenho o valor do primeiro dia do ano atual e anterior
    int anoAtual = 2023;
    int dataAtual = cal.jan1(anoAtual);
    int anoAnterior = 2023;
    int dataAnterior = cal.jan1(anoAnterior);

    // Então os valores obtidos devem ser iguais
    assertSame(dataAnterior, dataAtual);
  }
}
