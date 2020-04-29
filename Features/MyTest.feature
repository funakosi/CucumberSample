@サンプル
Feature: サンプルテスト
  文字列を出力するだけのサンプル

  @テスト
  Scenario Outline: サンプル
    Given FireFoxを開きアプリを起動する
    When ユーザ名 <username> とパスワード <password> を入力
    Then 資格情報をリセット

Examples:
|username  |password         |
|User1     |password1        |
|User2     |password2        |
|User3     |password3        |
