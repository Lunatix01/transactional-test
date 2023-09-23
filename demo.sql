CREATE EXTENSION IF NOT EXISTS "uuid-ossp";
CREATE TABLE public.user (
                        id UUID DEFAULT uuid_generate_v4() PRIMARY KEY,
                        name TEXT NOT NULL,
                        slug CHAR(3) NOT NULL
);
INSERT INTO public.user(id, name, slug) VALUES (uuid_generate_v4(), 'aland', 'ala');