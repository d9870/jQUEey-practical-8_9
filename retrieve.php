<?php
$m->MongoClient();
$db = $m->selectDB('TYITDB1');
$collection = $db->selectCollection('TYITCOL');
// retrieve data
$cursor = $collection->find();
foreach ($cursor as $document) {
    echo $document["name"] . "\n";
}
?>