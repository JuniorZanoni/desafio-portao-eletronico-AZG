package Services

import org.junit.jupiter.api.BeforeEach
import org.junit.jupiter.api.Test
import static org.junit.jupiter.api.Assertions.assertEquals

class PortaoServiceTest {

	static PortaoService portaoService

	@BeforeEach
	void instanciaPortaoService(){
		portaoService = new PortaoService()
	}

	@Test
	void comando1Test() {
		//given
		String entrada           = "..P...O....."
		String resultadoEsperado = "n= 1 | 001234555555"

		//when
		String resultadoObtido = portaoService.execute(entrada)

		//then
		assertEquals(resultadoEsperado, resultadoObtido )
	}

	@Test
	void comando2Test() {
		//given
		String entrada           = ".P...."
		String resultadoEsperado = "n= 0 | 012345"

		//when
		String resultadoObtido = portaoService.execute(entrada)

		//then
		assertEquals(resultadoEsperado, resultadoObtido )
	}

	@Test
	void comando3Test() {
		//given
		String entrada           = "...P.P...P.."
		String resultadoEsperado = "n= 0 | 000122222345"

		//when
		String resultadoObtido = portaoService.execute(entrada)

		//then
		assertEquals(resultadoEsperado, resultadoObtido )
	}

	@Test
	void comando4Test() {
		//given
		String entrada           = "P..O.."
		String resultadoEsperado = "n= 1 | 123455"

		//when
		String resultadoObtido = portaoService.execute(entrada)

		//then
		assertEquals(resultadoEsperado, resultadoObtido )
	}

	@Test
	void comando5Test() {
		//given
		String entrada           = "P..P...PO..."
		String resultadoEsperado = "n= 1 | 123333345555"

		//when
		String resultadoObtido = portaoService.execute(entrada)

		//then
		assertEquals(resultadoEsperado, resultadoObtido )
	}

	@Test
	void comando6Test() {
		//given
		String entrada           = "P...O.O.P...P.."
		String resultadoEsperado = "n= 2 | 123455554321111"

		//when
		String resultadoObtido = portaoService.execute(entrada)

		//then
		assertEquals(resultadoEsperado, resultadoObtido )
	}

	@Test
	void comando7Test() {
		//given
		String entrada           = "P.....P.P..P..."
		String resultadoEsperado = "n= 0 | 123455433332100"

		//when
		String resultadoObtido = portaoService.execute(entrada)

		//then
		assertEquals(resultadoEsperado, resultadoObtido )
	}

	@Test
	void comando8Test() {
		//given
		String entrada           = "P.....P..O...."
		String resultadoEsperado = "n= 1 | 12345543234555"

		//when
		String resultadoObtido = portaoService.execute(entrada)

		//then
		assertEquals(resultadoEsperado, resultadoObtido )
	}

	@Test
	void comando9Test() {
		//given
		String entrada           = "P.......P...O...OP.O."
		String resultadoEsperado = "n= 3 | 123455554321234554345"

		//when
		String resultadoObtido = portaoService.execute(entrada)

		//then
		assertEquals(resultadoEsperado, resultadoObtido )
	}

	@Test
	void comando10Test() {
		//given
		String entrada           = "..P...O....."
		String resultadoEsperado = "n= 1 | 001234555555"

		//when
		String resultadoObtido = portaoService.execute(entrada)

		//then
		assertEquals(resultadoEsperado, resultadoObtido )
	}

	@Test
	void comando11Test() {
		//given
		String entrada           = "..P........"
		String resultadoEsperado = "n= 0 | 00123455555"

		//when
		String resultadoObtido = portaoService.execute(entrada)

		//then
		assertEquals(resultadoEsperado, resultadoObtido )
	}
}