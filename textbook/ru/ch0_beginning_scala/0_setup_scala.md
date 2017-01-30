Before you begin
================

Scala — один из многих языков, которые работают поверх Java Runtime
Environment. Scala зиждется на JVM, использует классы Java и очень
достойно с ней интерпретирует. Поэтому перед установкой Scala вам
следует проверить наличие установленной версии Java. Мы рекомендуем
устанавливать версию JDK не ниже 1.8, т. .к курс опирается на версию
Scala 2.12, на более ранней версии ваш код работать не будет.

## Установить JDK
JDK (Java Development Kit) будет необходим вам для разработки на Scala.
Подробное описание процесса установки JDK на вашу платформу можно найти на
официальном сайте Oracle [здесь][jdk-install-overview].
Аналогичные инструкции можно найти для более поздних версий JDK.
Вполне подойдет свободная версия JDK — Open JDK. Т. ч., если вы — пользователь
Linux, можете установить пакет с OpenJdk при помощи пакетного менеджера.


## Проверить установленную версию Java
После установки JDK, `java` и `javac` должны оказаться в вашем $PATH.

    # Для windows:
    \>java –version
    Java version "1.8.0_31"
    Java (TM) SE Run Time
    Environment (build 1.8.0_31-b31)
    Java Hotspot (TM) 64-bit Server
    VM (build 25.31-b07, mixed mode)


    # Для Linux
    [~] java -version
    openjdk version "1.8.0_102"
    OpenJDK Runtime Environment (build 1.8.0_102-b14)
    OpenJDK 64-Bit Server VM (build 25.102-b14, mixed mode)

Вывод для обоих платформ нас вполне устраивает.


## Прописать JAVA_HOME в ваше окружение
О том, как сделать это для Windows, написано [здесь][java-home-windows].
В случае с [`Linux`][java-home-linux]/`OS X`, экспортируйте `$JAVA_HOME`
в ваш `bash.rc`.


## Установите SdkMan!
Конечно, все компоненты можно установить вручную и потратить на это
уйму времени. Мы предлагаем воспользоваться замечательнейшим
инструментом, способным установить большинство известных языков и
инструментов для JVM.

SDKMAN! — инструмент, позволяющий управлять множеством различных
версий SDK, установленных на вашей машине. Он поддерживает не только
Scala, но и Clojure, Groovy и Kotlin. SDKMAN также
позволяет устанавливать различные системы сборки: sbt и
Gradle. Для знакомых с Python и Ruby SdkMan — приближенный
аналог RVM, pyenv.

Инструкции по установке SdkMan вы можете найти по [ссылке][sdkman].

После того как вы установите SdkMan! и обязательно перезапустите shell
(или откроете новое окно/вкладку), мы установим последнюю версию Scala и
sbt - Simple Build Tool.

    # В вашем shell
    # без указания версии будет установлена последняя версия scala
    $ sdk install scala

    Downloading: scala 2.12.0

    In progress...

    ######################################################### 100.0%

    Installing: scala 2.12.0
    Done installing!

    Do you want scala 2.12.0 to be set as default? (Y/n): y

    Setting scala 2.12.0 as default.


После того как мы установили Scala давайте установим sbt:

    [~] sdk install sbt
    Downloading: sbt 0.13.13

    In progress...

    ######################################################### 100.0%

    Installing: sbt 0.13.13
    Done installing!

    Do you want sbt 0.13.13 to be set as default? (Y/n): y

    Setting sbt 0.13.13 as default.

Вот и все, наше окружение полностью готово к работе.


## Выбор IDE
IntelliJ IDEA Community Edition прекрасно поддерживает и Scala, и Dotty. И
мы рекомендуем использовать ее. Вы также можете воспользоваться ScalaIDE
или ENSIME Никто вам не запрещает вручную настроить Vim.

> Если все-таки вы собираетесь устанавливать Scala-IDE, проще всего сделать
> это, скачав готовую сборку IDE (нажав кнопку Download IDE) или пройдя по
> ссылке ниже. Вы также можете установить ее как плагин для Eclipse, конечно,
> если вы знаете, что делаете ☺.

IntelliJ IDEA: https://www.jetbrains.com/idea/specials/idea/idea.html
Scala-IDE: http://scala-ide.org/download/sdk.html
Ensime: https://github.com/ensime


### Плюсы и минусы выбора конкретной IDE
Выбирая IntelliJ IDEA, вы получаете лучшую на данный момент поддержку Scala,
огромное количество плагинов и достаточно высокую скорость работы.
Минус — если вам потребуется использовать Play framework, придется приобрести
полную версию продукта, что стоит денег. Хотя при невысоком уровне дискомфорта
можно по-прежнему обходиться Community Edition. Если у вас есть полная версия
(Ultimate), думаю, для вас выбор очевиден.

Выбирая Scala IDE, вы получаете Eclipse с отличной официальной поддержкой
Scala. Плюсы: Eclipse как свободная платформа с огромным количеством
доступных плагинов — платных и бесплатных. Вы получаете официальную
поддержку (что немаловажно). Также Play framework для Scala IDE будет работать
"из коробки". Вы его ставите и пользуетесь.

ENSIME — для тех, кто любит Vim или Emacs. Очень хорошо сделана поддержка для
Scala, и поддержку вашего любимого текстового редактора можно выделить в
качестве основного плюса. Не добавить, не убавить.

[jdk-install-overview]: https://docs.oracle.com/javase/8/docs/technotes/guides/install/install_overview.html
[java-home-windows]: https://confluence.atlassian.com/doc/setting-the-java_home-variable-in-windows-8895.html
[java-home-linux]: http://askubuntu.com/questions/175514/how-to-set-java-home-for-java/175519#175519
[sdkman]: http://sdkman.io/install.html

