@サンプル
Feature: サンプルテスト
  文字列を出力するだけのサンプル

  @テスト
  Scenario: サンプル
    Given FireFoxを開きアプリを起動する
    When ユーザ名とパスワードを入力
    Then 資格情報をリセット
