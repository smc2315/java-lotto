package lotto.controller;

import lotto.model.LottoCount;
import lotto.view.InputView;
import lotto.view.OutputView;

import static lotto.view.InputView.requestUserAmount;

public class LottoController {
    public void start(){
        LottoCount lottoCount = requestUserAmount();
    }

    private LottoCount requestUserAmount(){
        try{
            return new LottoCount(InputView.requestUserAmount());
        } catch (IllegalArgumentException e){
            OutputView.printException(e);
        }
        return new LottoCount(0);
    }
}
