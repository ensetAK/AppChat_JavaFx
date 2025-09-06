<h1>Application chat avec JavaFx, les sockets, et les threads</h1>
Une application desktop développée en JavaFX pour la gestion de produits avec une interface utilisateur élégante.

<h1>Structure du projet</h1>

<pre> 
src/
- main/
  - java/
    - com/
      - example/
        - chat/
          - App.java
          - ChatController.java
          - Message.java
          - Server.java
          - Client.java
  - resources/
    - com/
      - example/
        - chat/
          - chat.fxml
          - style.css
          </pre>
<h1>Fonctionnalités</h1>

- Envoyer/ recevoir des messages en temps réel
- Voir les messages alignés selon l’auteur (gauche/droite)
- isualiser les logs dans la console (connexions, déconnexions, messages)
- Affichage d’un message lorsque quelqu’un rejoint ou quitte

---

<h1>Technologies Utilisées</h1>
<table border="1" cellpadding="8" cellspacing="0" style="border-collapse: collapse; width: 100%; max-width: 600px;">
  <thead>
    <tr style="background-color: #f2f2f2;">
      <th style="text-align: left; width: 30%;">Technologies</th>
      <th style="text-align: left;">Description</th>
    </tr>
  </thead>
  <tbody>
    <tr>
      <td><strong>Java</strong></td>
      <td>Langage de programmation principal</td>
    </tr>
    <tr>
      <td><strong>JavaFX</strong></td>
      <td>Framework pour l'interface utilisateur</td>
    </tr>
    <tr>
      <td><strong>FXML</strong></td>
      <td>Markup pour la définition de l'interface</td>
    </tr>
    <tr>
      <td><strong>CSS</strong></td>
      <td>Stylisation moderne et responsive</td>
    </tr>
  </tbody>
</table>
