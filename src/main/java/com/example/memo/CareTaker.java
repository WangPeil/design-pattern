package com.example.memo;

import java.util.HashMap;

/**
 * @Author: peili.wang
 * @Date: 2020/4/13 00:03
 */
public class CareTaker {
    private HashMap<String, Memo> memoMaps;

    public CareTaker(HashMap<String, Memo> memoMaps) {
        this.memoMaps = memoMaps;
    }


    public HashMap<String, Memo> getMemoMaps() {
        return memoMaps;
    }

    public void setMemoMaps(HashMap<String, Memo> memoMaps) {
        this.memoMaps = memoMaps;
    }

    public Memo addMemo(Memo memo) {
        return memoMaps.put(memo.getMessage(), memo);
    }

    public Memo getMemo(String message) {
        return memoMaps.get(message);
    }
}
