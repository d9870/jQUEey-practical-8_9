<?php
$m->MongoClient();
$db = $m->selectDB('TYITDB1');
$collection = $db->selectCollection('TYITCOL');
// import data from json file to mongodb
$json = file_get_contents('data.json');
$data = json_decode($json);
$collection->insert($data);
echo "Data imported successfully";
?>