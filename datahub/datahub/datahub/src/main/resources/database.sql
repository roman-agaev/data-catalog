create user crypto with password 'password';
create database crypto owner crypto;

-- BASE TABLES
create table public.wallet_instance(address varchar NOT NULL,private_key varchar NOT NULL,creation_timestamp TIMESTAMP WITH TIME ZONE NOT NULL,blockchain_type varchar NOT NULL,PRIMARY KEY (address));
create table public.swap_operation(id varchar NOT NULL,operation_timestamp TIMESTAMP WITH TIME ZONE NOT NULL,approval_timestamp TIMESTAMP WITH TIME ZONE NOT NULL,swap_timestamp TIMESTAMP WITH TIME ZONE NOT NULL,blockchain_type varchar NOT NULL,wallet_address varchar NOT NULL,token_in varchar NOT NULL,token_out varchar NOT NULL,token_in_amount decimal NOT NULL,token_out_amount decimal NOT NULL,token_out_min_amount decimal NOT NULL,allowed_slippage decimal NOT NULL,conversion_rate decimal NOT NULL,approval_transaction_hash varchar NOT NULL,approval_transaction_fee decimal NOT NULL,swap_transaction_hash varchar NOT NULL,swap_transaction_fee decimal NOT NULL,PRIMARY KEY (id));

-- FIRST CHANGE - ADD FOREIGN KEY
alter table public.swap_operation ADD CONSTRAINT fk_address FOREIGN KEY(wallet_address) REFERENCES wallet_instance(address);

-- SECOND CHANGE - ADD FIELD
alter table public.swap_operation ADD COLUMN swap_executor VARCHAR NOT NULL;






