package Services

class PortaoService {

    StatusPortao statusPortaoAtual = StatusPortao.PARADO_ABRINDO
    Integer posicao = 0
    String resultado = ""
    Integer obstaculos = 0

    String execute(String entrada){
        for(int i = 0; i < entrada.size(); i++) {
            if(posicao == 5 || posicao == 0) {
                statusPortaoAtual = StatusPortao.PARADO_ABRINDO
            }

            verificaComando(entrada[i])
            resultado += posicao
        }

        return "n= ${obstaculos} | ${resultado}"
    }

    private void verificaComando(String comando) {
        switch (comando) {
            case ".": comandoPonto()
                break
            case "P": comandoP()
                break
            case "O": comandoO()
                break
        }
    }

    private void comandoPonto() {
        switch (statusPortaoAtual) {
            case StatusPortao.ABRINDO:
                posicao++
                break
            case StatusPortao.FECHANDO:
                posicao--
                break
        }
    }

    private void comandoP() {
        switch (statusPortaoAtual) {
            case StatusPortao.PARADO_ABRINDO:
                if(posicao < 5) {
                    statusPortaoAtual = StatusPortao.ABRINDO
                    posicao++
                } else if(posicao == 5) {
                    statusPortaoAtual = StatusPortao.FECHANDO
                    posicao--
                }
                break
            case StatusPortao.ABRINDO:
                statusPortaoAtual = StatusPortao.PARADO_ABRINDO
                break
            case StatusPortao.FECHANDO:
                statusPortaoAtual = StatusPortao.PARADO_FECHANDO
                break
            case StatusPortao.PARADO_FECHANDO:
                statusPortaoAtual = StatusPortao.FECHANDO
                posicao--
                break
        }
    }

    private void comandoO() {
        obstaculos++

        if(posicao < 5 && statusPortaoAtual == StatusPortao.ABRINDO) {
            posicao++
        } else if(statusPortaoAtual == StatusPortao.FECHANDO) {
            posicao++
            statusPortaoAtual = StatusPortao.ABRINDO
        }
    }
}
