<?php

$m->MongoClient();
$db = $m->selectDB('TYITDB1');
$collection = $db->selectCollection('TYITCOL');
$document = array(
    "name" => "Deepak",
    "age" => 23,
    "RollNo" => 229749,
    "Project" => "Guess what?"

);
$collection->insert($document);
echo "Data inserted successfully";
?>