# RestTemplateにいついて

> https://qiita.com/yk0614/items/c306bddc66ab7882c7ba  
> chatGPT : Resttemplate

RestTemplateは、HTTPのリクエストやレスポンスを扱うためのクラスです。RestTemplateは、  
内部的にHttpMessageConverterを使用して、HTTPのリクエストやレスポンスのデータとJavaオブジェクトの変換を行います。  
JSON形式のデータを扱う場合、RestTemplateではデフォルトでJacksonライブラリを使用するMappingJackson2HttpMessageConverterが利用されます。  
MappingJackson2HttpMessageConverterは、HTTPのリクエストやレスポンスのコンテンツタイプ（Content-Type）  
がapplication/jsonである場合に動作します。
つまり、RestTemplateを使用してJSONデータをやり取りする場合、リクエストヘッダーのContent-Typeをapplication/jsonに設定する必要があります。  
同様に、レスポンスのContent-Typeもapplication/jsonである必要があります。

Addressクラスだと受け取れなかったのはContentTypeが違ったせい  
Stringクラスで受け取った時のコンテントタイプ↓  
<img src="https://github.com/kamide28/findaddress/assets/127748178/0da90502-a999-49a2-9172-260fa9ef6abe" width="40%">  
RestTemplateResolverクラスを入れたあと↓  
<img  src="https://github.com/kamide28/findaddress/assets/127748178/6d946806-5489-467f-b385-5b21f426fc72" width="40%">

# アノテーション

## @Componentとは

@Compnentは、Spring BootでWebのMVCアプリを作成するときに使用する@Controller, @Service, @Repositoryと同様に、  
SpringのDIコンテナに管理させて@AutowireなどでDIできるようにしたい自作クラスにつける。

@Controller等はMVCの文脈上で特化したクラスにつけられるのに対して、@Componentはそれら以外の特化していないクラス全般に付与するだけで、基本的には同じ。

＊@Beanとは
@Beanも同様にSpringのDIコンテナに管理させたいものにつける点は同じ。外部のライブラリーにつける？
@Configurationをつけたクラスの中で、DIコンテナに管理させたいクラスのインスタンスを作成するメソッドにつける。



