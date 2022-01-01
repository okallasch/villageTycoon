
INSERT INTO users
	(id, name)
	VALUES (1, 'Test');

INSERT INTO stockpile
    (id, clay, crop, iron, wood, user_entity_id)
	VALUES (1, 100, 100, 100, 100, 1);

INSERT INTO unit
	(id, name, attack, defence_infantry, defence_cavalry, speed, carrying_capacity, consumption, wood_cost, clay_cost, iron_cost)
	VALUES (1, 'Legionnaire', 40, 35, 50, 6, 50, 1, 75, 50, 100);



INSERT INTO building
	(id, name, description, type, wood_cost, clay_cost, iron_cost, crop_cost)
	VALUES (1, 'Warehouse', 'Place for storage Resources', 'PRODUCTION', 140, 180, 100, 0);

