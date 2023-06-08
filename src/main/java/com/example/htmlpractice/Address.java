package com.example.htmlpractice;

import java.util.List;

public class Address {
    private String message;
    private List<Result> results;
    private int status;

    // コンストラクタ
    public Address(String message, List<Result> results, int status) {
        this.message = message;
        this.results = results;
        this.status = status;
    }

    public Address() {
    }

    // getter
    public String getMessage() {
        return message;
    }

    public List<Result> getResults() {
        return results;
    }

    public int getStatus() {
        return status;
    }


    // Resultという名前の内部クラスを作成
    public static class Result {
        private String address1;
        private String address2;
        private String address3;
        private String kana1;
        private String kana2;
        private String kana3;
        private String prefcode;
        private String zipcode;

        // コンストラクタ
        public Result(String address1, String address2, String address3, String kana1, String kana2, String kana3,
                      String prefcode, String zipcode) {
            this.address1 = address1;
            this.address2 = address2;
            this.address3 = address3;
            this.kana1 = kana1;
            this.kana2 = kana2;
            this.kana3 = kana3;
            this.prefcode = prefcode;
            this.zipcode = zipcode;
        }

        public Result() {
        }

        // getter
        public String getAddress1() {
            return address1;
        }

        public String getAddress2() {
            return address2;
        }

        public String getAddress3() {
            return address3;
        }

        public String getKana1() {
            return kana1;
        }

        public String getKana2() {
            return kana2;
        }

        public String getKana3() {
            return kana3;
        }

        public String getPrefcode() {
            return prefcode;
        }

        public String getZipcode() {
            return zipcode;
        }
    }


}
