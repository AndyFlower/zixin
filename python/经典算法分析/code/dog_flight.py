attack_vals = {
    '柯基':30,
'萨摩耶':40
}
def dog(name,d_type):
    data = {
        'name': name,
        'd_type': d_type,
        #'attack_val': 30,
        'life_val': 100

    }
    if d_type in attack_vals:
        data['attack_val']=attack_vals['d_type']
    else:
        data['attack_val'] = 15
    return data

d1 = dog('keji','柯基')
d2 = dog('samoye','萨摩耶')