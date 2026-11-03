# Scrumboard
 
Teamprojekt (9 Personen) im Rahmen der Veranstaltung „Softwaretechnik" an der Universität Rostock: eine Webanwendung zum Verwalten von Listen, User Stories und Tasks mit REST-API und Weboberfläche.
 
**Mein Anteil:** Entwicklung des Backends, Umsetzung der API-Schnittstelle zwischen Frontend und Backend und Anpassung des Frontends, damit die Inhalte der Datenbank angezeigt werden.
 
## Technologien
 
Java 21, Spring Boot 3.4.3 (Spring Web, Spring Data JPA), H2-Datenbank, Gradle, HTML und JavaScript
 
## Starten
 
Voraussetzungen: Git und Java 21 (JDK). Alle weiteren Abhängigkeiten (Spring Boot, H2) lädt Gradle automatisch.
 
1. `git clone https://github.com/EmilisKrup/Scrum.git`
2. `cd <PROJEKTORDNER>`
3. `gradlew.bat bootRun` (Windows) bzw. `./gradlew bootRun` (macOS/Linux)
4. Im Browser `http://localhost:8080` öffnen
Die H2-Konsole ist unter `http://localhost:8080/h2-console` erreichbar (JDBC-URL `jdbc:h2:mem:testdb`, Benutzer `sa`, kein Passwort).

- Ersetzen Sie `<PROJEKTORDNER>` durch den Namen des Ordners, der dabei entsteht.
 
## Hinweis
 
Die Datenbank liegt nur im Arbeitsspeicher, die Daten gehen beim Beenden verloren. Die Anmeldung ist nur zur Demonstration umgesetzt.  

