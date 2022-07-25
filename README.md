# tennis-stats

Technologie : Java 17 + Spring boot (hibernate etc) + h2  
Durée passée : 4h30

Ce qui n'est pas fait :
 - Les exceptions devront être gérées
 - L’implémentation des tests unitaires
 - Ajouter les fonctionnalités supplémentaires que tu souhaites
 - la tâche 3 - Créer un endpoint qui retourne les statistiques suivantes :
    - Pays qui a le plus grand ratio de parties gagnées
    - IMC moyen de tous les joueurs
    - La médiane de la taille des joueurs
 - la tâche 4 - Déploie ton projet sur le Cloud.

## Lancer le projet

 1. L'ajouter dans un eclipse,
 1. Clique droit sur  "src/main/java/org/jca/tennisstats/TennisStatsApplication.java"
 1. Choisir "Run as application"
 1. ça démarrera sur "localhost:8080"
 1. url fonctionnelle : 
    - `localhost:8080/players/list`
    - `localhost:8080/players/52` (et les autres)
    - `localhost:8080/countries/list`
    - `localhost:8080/h2-console` (pour la BDD)

## Les bugs

 - dans les RankData, `last` est vide
